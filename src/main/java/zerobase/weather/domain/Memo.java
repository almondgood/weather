package zerobase.weather.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "memo")
public class Memo {

    @Id @GeneratedValue(strategy = IDENTITY)
    private int id;
    private String text;
}
