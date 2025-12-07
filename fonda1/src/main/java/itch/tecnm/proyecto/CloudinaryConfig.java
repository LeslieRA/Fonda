package itch.tecnm.proyecto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;


@Configuration
public class CloudinaryConfig {

    @Bean
    public Cloudinary cloudinary() {
        return new Cloudinary(ObjectUtils.asMap(
            "cloud_name", "dlfxbftzp",
            "api_key", "992772981244268",
            "api_secret", "AsxdeFXqb_338oERAohdMjhDCBw",
            "secure", true
        ));
    }
    
}
