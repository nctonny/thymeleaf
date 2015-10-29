/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.processor.text;

import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.model.IText;
import org.thymeleaf.processor.IProcessor;

/**
 * <p>
 *   Base interface for all processors that execute on Text events ({@link IText}).
 * </p>
 *
 * @author Daniel Fern&aacute;ndez
 * @see AbstractTextProcessor
 * @see ITextStructureHandler
 * @since 3.0.0
 * 
 */
public interface ITextProcessor extends IProcessor {

    public void process(
            final ITemplateContext context,
            final IText text, final ITextStructureHandler structureHandler);

}
