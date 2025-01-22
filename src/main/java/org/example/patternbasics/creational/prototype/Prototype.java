package org.example.patternbasics.creational.prototype;

/**
 * Base prototype interface that defines cloning method
 */
interface Prototype extends Cloneable {
    Prototype clone();
}