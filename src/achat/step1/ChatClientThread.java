package achat.step1;

//서버가 한 말을 듣는 클래스 설계
public class ChatClientThread extends Thread {
	/*선언부*/

	ChatClient cc = null; //이걸하지 않으면 저 클래스 null에러 발생
	public ChatClientThread(ChatClient cc) {
		this.cc = cc;
	}
	/*생성자*/

	/*정의메소드*/

	/*메인메소드*/
}
