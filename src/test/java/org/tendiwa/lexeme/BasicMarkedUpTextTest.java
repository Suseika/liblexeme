package org.tendiwa.lexeme;

import junit.framework.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public final class BasicMarkedUpTextTest {

    /**
     * BasicMarkedUpText knows its id.
     */
    @Test
    public void knowsItsId() {
        Assert.assertEquals(
            "action.act",
            new BasicMarkedUpText(
                Mockito.mock(Language.class),
                Mockito.mock(NativeSpeaker.class),
                new TextBundleParserFactory()
                    .create(
                        "action.act(actor, seer) {",
                        "  [Actor][;seer]. And then [seer][;actor]",
                        "}"
                    )
                    .text()
            )
                .id()
        );
    }
}
