package chap14;
import java.io.*;
class DugeonGame implements Serializable {
	public int x = 3;
	transient long y = 4;
	private short z = 5;
	int getX(){
		return x;
	}
	long getY(){
		return y;
	}
	short getZ(){
		return z;
	}
}
