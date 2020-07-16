package DependencyInversions;

/**
 * Created by DostM on 7/16/2020.
 * High-level modules(component) must not depend on low-level modules. Both should depend on abstractions. abstractions should not depend on details. Details should depend on abstractions.
 *
 */
public interface Ebook {
    public void readBook();
}

