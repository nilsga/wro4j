package ro.isdc.wro.extensions.processor.support.dustjs;

import java.io.InputStream;

import ro.isdc.wro.extensions.processor.support.template.AbstractJsTemplateCompiler;


/**
 * Dust is a JavaScript templating engine designed to provide a clean separation between presentation and logic without
 * sacrificing ease of use. It is particularly well-suited for asynchronous and streaming applications.
 *
 * @author Eivind Barstad Waaler
 * @since 1.4.5
 * @created 8 Mar 2012
 */
public class DustJs extends AbstractJsTemplateCompiler {
  private static final String DEFAULT_DUST_JS = "dust-full-1.1.1.min.js";

  /**
   * {@inheritDoc}
   */
  @Override
  protected InputStream getCompilerAsStream() {
    return DustJs.class.getResourceAsStream(DEFAULT_DUST_JS);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected String getCompileCommand() {
    return "dust.compile";
  }
}
