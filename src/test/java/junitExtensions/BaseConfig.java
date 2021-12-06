package junitExtensions;
import core.ApplicationProperties;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import static com.codeborne.selenide.Selenide.open;

public class BaseConfig implements BeforeEachCallback, AfterEachCallback {

    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {

    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        open(ApplicationProperties.getInstance().getUrl());

    }
}
