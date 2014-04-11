import java.util.Arrays;

import org.apache.hadoop.io.ArrayWritable;
import org.apache.hadoop.io.Writable;

public class CustomArrayWritable extends ArrayWritable {

	public CustomArrayWritable(Class<? extends Writable> valueClass,
			Writable[] values) {
		super(valueClass, values);
	}

	public CustomArrayWritable(Class<? extends Writable> valueClass) {
		super(valueClass);
	}

	@Override
	public Writable[] get() {
		return (Writable[]) super.get();
	}

	@Override
	public String toString() {
		return Arrays.toString(get());
	}
}