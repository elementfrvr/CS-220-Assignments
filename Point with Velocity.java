public class Point <T> {
	private T X;
	private T Y;
	private float Velocity;
	
	public Point(T x,T y){
		this.X=x;
		this.Y=y;
	}
	public Point(T x, T y, float velocity){
		this.X=x;
		this.Y=y;
		this.Velocity=velocity;
	}
	
	public T getX(){
		return X;
	  }
	
	public void setX(T x){
	    X=x;
	  }
	
	public T getY(){
		return Y;
	  }
	
	public void setY(T y){
	    Y=y;
	  }
	
	public float getVelocity(){
		return Velocity;
	  }
	
	public void setVelocity(float velocity){
	    Velocity=velocity;
	  }

}
