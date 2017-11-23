package nl.jts.fysioadc.domain;


import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor (staticName = "objectFactory")
public class Praktijk {

    @NonNull private String name;
    @NonNull private String woonplaats;
    @NonNull private String straatnaam;
    @NonNull private String huisnummer;

    public String getLocation(){
        return "ergens";
    }


}
