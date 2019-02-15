/*
 * This file is part of VLCJ.
 *
 * VLCJ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * VLCJ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with VLCJ.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright 2009-2019 Caprica Software Limited.
 */

package uk.co.caprica.vlcj.medialist.events;

import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.binding.internal.libvlc_instance_t;
import uk.co.caprica.vlcj.medialist.MediaList;
import uk.co.caprica.vlcj.medialist.MediaListEventListener;

/**
 * Encapsulation of a media list end reached event.
 */
final class MediaListEndReachedEvent extends MediaListEvent {

    /**
     * Create a media list event.
     *
     * @param libvlc native library
     * @param libvlcInstance native library instance
     * @param mediaList media list the event relates to
     */
    MediaListEndReachedEvent(LibVlc libvlc, libvlc_instance_t libvlcInstance, MediaList mediaList) {
        super(libvlc, libvlcInstance, mediaList);
    }

    @Override
    public void notify(MediaListEventListener listener) {
        listener.mediaListEndReached(mediaList);
    }

}
