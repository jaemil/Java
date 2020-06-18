package com.company;

public abstract class AbstractOrdered implements Ordered {

    @Override
    public abstract boolean eq(Object o);

    @Override
    public boolean neq(Object o) {
        return !this.eq(o);
    }

    @Override
    public abstract boolean gt(Object o);

    @Override
    public boolean lt(Object o) {
        return !this.gt(o) && !this.eq(o);
    }

    @Override
    public boolean ge(Object o) {
        return !lt(o);
    }

    @Override
    public boolean le(Object o) {
        return !this.gt(o);
    }
}
