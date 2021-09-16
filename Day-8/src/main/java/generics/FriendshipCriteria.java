package generics;

import java.util.Comparator;

public class FriendshipCriteria<T extends Comparable<T>,S extends Comparable<S>> implements Comparator<T> {

    public Boolean findFriend(T arg0,S arg1){


    }

    @Override
    public int compare(T o1, T o2) {
        return 0;
    }
}
