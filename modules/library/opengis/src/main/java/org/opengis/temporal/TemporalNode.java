/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2011, Open Source Geospatial Foundation (OSGeo)
 *    (C) 2005, Open Geospatial Consortium Inc.
 *
 *    All Rights Reserved. http://www.opengis.org/legal/
 */
package org.opengis.temporal;

import static org.opengis.annotation.Obligation.MANDATORY;
import static org.opengis.annotation.Obligation.OPTIONAL;
import static org.opengis.annotation.Specification.ISO_19108;

import org.opengis.annotation.UML;

/**
 * A zero dimensional topological primitive in time.
 *
 * @author Alexander Petkov
 */
@UML(identifier = "TM_Node", specification = ISO_19108)
public interface TemporalNode extends TemporalTopologicalPrimitive {
    /** An optional association that may link this temporal node to its corresponding instant. */
    @UML(identifier = "Realization", obligation = OPTIONAL, specification = ISO_19108)
    Instant getRealization();

    /** Links this temporal node to the previous temporal edge. */
    @UML(identifier = "previousEdge", obligation = MANDATORY, specification = ISO_19108)
    TemporalEdge getPreviousEdge();

    /** Links this temporal node to the next temporal edge. */
    @UML(identifier = "nextEdge", obligation = MANDATORY, specification = ISO_19108)
    TemporalEdge getNextEdge();
}
