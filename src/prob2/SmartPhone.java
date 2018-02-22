package prob2;

public class SmartPhone extends MusicPhone {
	@Override
	public void execute(String function) {
		if ( function.equals("음악") ) {
			startApp();
			return;
		}
		
		super.execute( function );
	}
	
	protected void startApp() {
		System.out.println("앱실행");
	}
}
