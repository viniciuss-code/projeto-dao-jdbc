package db;

public class DbIntegrityException extends RuntimeException {
	
	public static final long serialVersionUID = 1;
	
	public DbIntegrityException(String msg) {
		super(msg);
	}
}
