package de.hhu.propra.team61.objects;

import javafx.geometry.Point2D;

/**
 * Created by markus on 20.05.14.
 * Modified by kevin on 12.06.14.
 */
public class CollisionException extends Exception {

    private String collisionPartnerClass;

    private Point2D lastGoodPosition;
    private Point2D collidingPosition;

    public CollisionException(String collisionPartnerClass, Point2D collidingPosition, Point2D lastGoodPosition) {
        this.collisionPartnerClass = collisionPartnerClass;
        this.lastGoodPosition = lastGoodPosition;
        this.collidingPosition = collidingPosition;
    }

    public String getCollisionPartnerClass() {
        return collisionPartnerClass;
    }

    public Point2D getLastGoodPosition() {
        return lastGoodPosition;
    }

    public Point2D getCollidingPosition() {
        return collidingPosition;
    }
}
