package prob5;

public class MyStack{
	private int top;
	private int maxSize;
	private String[] buffer;
	
	public MyStack() {
		
	}

	public MyStack(int maxSize) {
		super();
		this.maxSize = maxSize;
		buffer = new String[maxSize];
		top = -1;
	}
	
	public void push(String data) throws MyStackException{
		top++;
		
		if(top >= maxSize) {
			maxSize *= maxSize;
			
			//배열 크기 증가를 위해 임시 배열 생성
			String[] tempArray = new String[maxSize];
			
			//원래 배열의 데이터를 임시 배열에 옮기는 작업
			for(int i=0;i<buffer.length;i++)
				tempArray[i] = buffer[i];
			
			//크기 증가.
			buffer = tempArray;
		}
		
			buffer[top] = data;
	}

	public boolean isEmpty() {
		if(top == -1)
			return true;
		else 
			return false;
	}
	
	public String pop() throws MyStackException{
		if(top < 0)
			throw new  MyStackException("prob4.MyStackException:stack is empty");
		return buffer[top--];
	}
}