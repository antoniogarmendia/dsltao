package org.mondo.editor.graphiti.diagram.properties;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.AbstractPropertySectionFilter;

/**
 * Filter for EReference objects.
 * 
 * @author miso partner AnaPescador
 *
 */
public class EReferenceFilter extends AbstractPropertySectionFilter {
	 
    @Override
    protected boolean accept(PictogramElement pe) {
    	EObject eObject = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
        if (eObject instanceof EReference) {
            return true;
        }
        return false;
    }
}
