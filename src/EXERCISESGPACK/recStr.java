package EXERCISESGPACK;

/**
 * Created by dip17_000 on 17.06.2016.
 */
class recStr {
    String str;

    recStr() {
        str = "";
    }

    String outStr(String _str) {
        str += _str.charAt(_str.length() - 1);
        if (_str.length() == 1) {
            return "";
        }
        return outStr(_str.substring(0, _str.length() - 1));
    }
}
