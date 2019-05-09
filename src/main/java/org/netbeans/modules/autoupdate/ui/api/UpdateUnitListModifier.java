package org.netbeans.modules.autoupdate.ui.api;

import java.util.List;
import org.netbeans.api.autoupdate.UpdateUnit;

/** <code>UpdateUnitListModifier</code> modifies a list of {@link org.netbeans.api.autoupdate.UpdateUnit} items.
 * After {@link org.netbeans.modules.autoupdate.ui.PluginManagerUI} creates the list,
 * it looks for providers of this service registered in the global lookup, and calls them to modify the list.
 *
 * @author jhuber
 */
public interface UpdateUnitListModifier {
    public List<UpdateUnit> modifyList(List<UpdateUnit> uList);
} 