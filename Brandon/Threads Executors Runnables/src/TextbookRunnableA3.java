class TextbookRunnableA3 implements Runnable {
	private char charToPrint;
	private int times;
	
	public TextbookRunnableA3(char c, int t) {
		charToPrint = c;
		times = t;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < times; i++){
			System.out.print(charToPrint);
		}
	}
}