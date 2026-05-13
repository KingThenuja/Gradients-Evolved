package net.thenu.ge.platform;

import java.util.ServiceLoader;

public class Services {
    public static final IPlatformHelper PLATFORM = load(IPlatformHelper.class);
    private static <T> T load(Class<T> clazz) {
        return ServiceLoader.load(clazz).findFirst()
            .orElseThrow(() -> new IllegalStateException("No implementation found for " + clazz.getName()));
    }
}
