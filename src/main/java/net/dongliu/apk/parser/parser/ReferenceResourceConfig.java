package net.dongliu.apk.parser.parser;

import lombok.Data;
import net.dongliu.apk.parser.struct.ResourceValue.ReferenceResourceValue;

/**
 * Config of reference resource
 *
 * @author zhuxiaoshuai1
 * @date 2021/06/25
 * @see ReferenceResourceValue
 */
@Data
public class ReferenceResourceConfig {
    private DensityPolicy densityPolicy;
    private Boolean localeStrict;

    public static ReferenceResourceConfig createDefault() {
        ReferenceResourceConfig config = new ReferenceResourceConfig();
        config.setDensityPolicy(DensityPolicy.DEFAULT);
        config.setLocaleStrict(false);
        return config;
    }
}
