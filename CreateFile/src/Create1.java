package crunchify.com.tutorial;
 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
 
/**
 * @author Crunchify.com 
 * Total 6 different way to create an Object in Java
 */
 
public class Create1 implements Cloneable, Serializable {
 
	private static final long serialVersionUID = 1L;
 
	public Create1() {
		log("Hello! CrunchifyObj() just got created..");
	}
 
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (Create1) super.clone();
	}
 
	@SuppressWarnings({ "unused", "resource", "rawtypes" })
	public static void main(String[] args) throws Exception {
 
		// Create Object1
		Create1 object1 = new Create1();
 
		// Create Object2
		Create1 object2 = (Create1) Class.forName("crunchify.com.tutorial.CrunchifyObj").newInstance();
 
		// Create Object3
		Create1 secondObject = new Create1();
		Create1 object3 = (Create1) secondObject.clone();
 
		// Create Object4
		Object object4 = Create1.class.getClassLoader().loadClass("crunchify.com.tutorial.CrunchifyObj")
				.newInstance();
 
		// Create Object5: Create a new file with an ObjectOutputStream
		FileOutputStream out = new FileOutputStream("crunchify.txt");
		ObjectOutputStream oout = new ObjectOutputStream(out);
		oout.writeObject(object4); // write object4 to file
		oout.flush();
 
		// create an ObjectInputStream for the file we created before
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("crunchify.txt"));
		Create1 object5 = (Create1) ois.readObject();
		log(object5.toString());
 
		// Create Object6: use the Constructor class from the java.lang.reflect
		Class clazz = Create1.class;
		Constructor crunchifyCon = clazz.getDeclaredConstructors()[0];
		Create1 obj = (Create1) crunchifyCon.newInstance();
	}
 
	private static void log(String object) {
		System.out.println(object);
 
	}
}
