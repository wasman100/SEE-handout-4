import acm.program.*;

public class tracing extends ConsoleProgram {
	public void run() {
		ghost(13);
		}
		private void ghost(int x) // x = 13
		{
		int y = 0; // y = 0
		for (int i = 1; i < x; i *= 2) // 1 2 4 8 16 runs 4 times
		{
		y = witch(y, skeleton(x, i)); // i = 1 2 4 8  x = 13
		}
		println("ghost: x = " + x + ", y = " + y);// ghost: x = 13, y = 1011
		}
		private int witch(int x, int y) // x = 0, 1, 10, 110 y= 1 0 1 1
		{
		x = 10 * x + y; // 1, 10, 101, 1011
		println("witch: x = " + x + ", y = " + y); // witch x = 1, y = 0 witch x = 10, y = 0 witch x = 101, y = 0 
		//witch x = 1011, y = 0
		return x;// 1, 10, 101, 1011
		}
		private int skeleton(int x, int y) // x = 13 i = i = 1 2 4 8
		{
		return x / y % 2; // 1, 0, 1, 1
		}

}
