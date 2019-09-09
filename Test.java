
public class Test {
public static void main(String[] args) {
	while (Zen.isRunning()) {
		String text = Zen.getEditText();
		Zen.drawText(text, 100, 100);
		
		Zen.fillRect(Zen.getMouseX() - 16, Zen.getMouseY() - 16, 32, 32);
		
		long clickTime = Zen.getMouseClickTime();
		String mesg = "Clicked at " + clickTime;
		Zen.drawText(mesg, Zen.getMouseClickX(), Zen.getMouseClickY());
		
		Zen.flipBuffer();
	} // while
}
}
