package creational.factory.abstraite.families.appbar;

/**
 * All products families have the same varieties (Android/ios).
 * This is a variant of an appbar.
 */
public class IosAppBar implements AppBar {
    @Override
    public void paint() {
        System.out.println("You have created IosAppBar.");
    }
}
