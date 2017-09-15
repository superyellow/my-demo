package constructor;

import okhttp3.internal.Util;

import java.util.List;

/**
 * @author simple_huang@foxmail.com on 2017/9/15.
 */
public final class Animal {
    private final List<String> encodedNames;
    private final List<String> encodedValues;

    Animal(List<String> encodedNames, List<String> encodedValues) {
        this.encodedNames = Util.immutableList(encodedNames);
        this.encodedValues = Util.immutableList(encodedValues);
    }

}
