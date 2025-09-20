// java -cp /Library/Java/JavaVirtualMachines/jdk-25.jdk/Contents/Home/lib/commons-lang3-3.18.0.jar ReferenceNonJDKClass.java

import org.apache.commons.lang3.RandomUtils;

public class ReferenceNonJDKClass {

    public static void main(String[] args) {
        IO.println(RandomUtils.nextInt(0, 100));
    }

}
