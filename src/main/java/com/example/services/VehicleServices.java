package com.example.services;

import com.example.interfaces.Speakers;
import com.example.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
/*@Scope(BeanDefinition.SCOPE_SINGLETON) It's By Default */
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class VehicleServices {
    @Autowired
    private Speakers speakers;
    @Autowired
    private Tyres tyres;

    public  void playMusic(){
        String music = speakers.playMusic();
        System.out.println(music);
    }

    public void rotate(){
        String status = tyres.rotate();
        System.out.println(status);
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
