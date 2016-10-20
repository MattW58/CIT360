class TextbookRunnableA2 implements Runnable{
	private int lastNum;

	public TextbookRunnableA2(int n){
		lastNum = n;
	}

	@Override
	public void run(){
		for (int i = 1; i <= lastNum; i++){
			System.out.print(" " + i);
		}
	}
}