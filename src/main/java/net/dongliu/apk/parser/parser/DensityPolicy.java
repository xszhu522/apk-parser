package net.dongliu.apk.parser.parser;

import net.dongliu.apk.parser.struct.resource.Densities;

/**
 * Density selected policy
 *
 * @author zhuxiaoshuai1
 * @date 2021/06/24
 */
public enum DensityPolicy {
    /**
     * select max density
     */
    MAX,
    /**
     * select min density
     */
    MIN,

    // select fixed density
    DEFAULT(Densities.DEFAULT),
    LOW(Densities.LOW),
    MEDIUM(Densities.MEDIUM),
    TV(Densities.TV),
    HIGH(Densities.HIGH),
    XHIGH(Densities.XHIGH),
    XXHIGH(Densities.XXHIGH),
    XXXHIGH(Densities.XXXHIGH),
    ANY(Densities.ANY),
    NONE(Densities.NONE),
    ;

    private Integer density;

    DensityPolicy() {
    }

    DensityPolicy(int density) {
        this.density = density;
    }

    public int getDensity() {
        return density;
    }

    public void setDensity(int density) {
        this.density = density;
    }
}
