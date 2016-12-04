package attrsview.processor;

import com.google.auto.service.AutoService;
import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;

/**
 * Created by jasonni on 12/4/16.
 */

@SupportedAnnotationTypes("attrsview.AttrsView")
@SupportedSourceVersion(SourceVersion.RELEASE_7)
@AutoService(Processor.class)
public class AttrsViewProcessor extends AbstractProcessor {

  @Override public synchronized void init(ProcessingEnvironment processingEnvironment) {
    super.init(processingEnvironment);
    processingEnvironment.getMessager().printMessage(Diagnostic.Kind.NOTE, "init...");
  }

  @Override
  public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {

    processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "process...");

    return true;
  }
}
