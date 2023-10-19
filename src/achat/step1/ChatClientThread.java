package achat.step1;

import java.util.StringTokenizer;
import java.util.Vector;

//서버가 한 말을 듣는 클래스 설계
public class ChatClientThread extends Thread {
	/*선언부*/
	ChatClient cc = null; //이걸하지 않으면 저 클래스 null에러 발생
	/*생성자*/
	public ChatClientThread(ChatClient cc) {
		this.cc = cc;
	}

	/*정의메소드*/
	//서버에서 말한 내용 들어보기
	public void run() {
		boolean isStop = false;
		start:
		while(!isStop) {
			try {
				String msg = "";
				msg = (String)cc.ois.readObject();
				StringTokenizer st = null;
				int protocol = 0;//100|200|500(나가기)
				if(msg !=null) {
					st = new StringTokenizer(msg,"|");
					protocol = Integer.parseInt(st.nextToken());//100
				}
				switch(protocol) {
					case 100: {// 100|kiwi - 입장하기 처리
						String nickName = st.nextToken();//kiwi
						cc.jta_display.append(nickName+"님이 입장하였습니다.\n");
						Vector<String> v = new Vector<>();
						v.add(nickName);
						cc.dtm.addRow(v);
					}break;
					case 200:{//다자간 대화 처리
						
					}break;
					case 500:{//나가기 처리
						
					}break start;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

