package section05.s08_objectinputstream_objectoutputstream;

import java.io.Serializable;

public class ClassC implements Serializable{
	static final long serialVersionUID =12345678;
	int field1;
    int field2;
	
	public ClassC() {}
	public ClassC(int field1) {
		this.field1 = field1;
	}

}
