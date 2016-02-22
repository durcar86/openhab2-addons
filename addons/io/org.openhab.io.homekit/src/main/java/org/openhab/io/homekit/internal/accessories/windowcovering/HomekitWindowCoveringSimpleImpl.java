/**
 * Copyright (c) 2014-2015 openHAB UG (haftungsbeschraenkt) and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.io.homekit.internal.accessories.windowcovering;

import java.util.concurrent.CompletableFuture;

import org.eclipse.smarthome.core.items.ItemRegistry;
import org.eclipse.smarthome.core.library.items.RollershutterItem;
import org.openhab.io.homekit.internal.HomekitAccessoryUpdater;
import org.openhab.io.homekit.internal.HomekitTaggedItem;

import com.beowulfe.hap.HomekitCharacteristicChangeCallback;

/**
 * HomeKit WindowCovering implemented with a RollershutterItem
 * 
 * @author Andy Lintner
 */
class HomekitWindowCoveringSimpleImpl extends AbstractHomekitWindowCovering<RollershutterItem> {

    public HomekitWindowCoveringSimpleImpl(HomekitTaggedItem taggedItem, ItemRegistry itemRegistry,
            HomekitAccessoryUpdater updater) {
        super(taggedItem, itemRegistry, updater, RollershutterItem.class);
    }

    @Override
    public CompletableFuture<Boolean> getObstructionDetected() {
        return CompletableFuture.completedFuture(false);
    }

    @Override
    public void subscribeObstructionDetected(HomekitCharacteristicChangeCallback arg0) {
        // No implementation
    }

    @Override
    public void unsubscribeObstructionDetected() {
        // No implementation
    }

    @Override
    protected String getPositionItemName() {
        return getItemName();
    }

}
