package impl;

import java.io.DataInput;
import java.util.Date;

/**
 * The test interface.
 * 
 * @author Ronny Neumeier
 *
 */
public interface test002 extends DataInput {

	/**
	 * The name.
	 */
	String name = "test";
	/**
	 * The current date.
	 */
	Date date = new Date();
}
