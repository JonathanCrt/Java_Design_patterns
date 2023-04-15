package creational.factory.abstraite.families.appbar;

/**
 * Abstract Factory assumes that you have several families of products,
 * structured into separate class hierarchies (Button/Appbar/Table). All products of
 * the same family have the common interface.
 * This is the common interface for buttons family.
 */
public interface AppBar {
    void paint();
}