package racingcargame.domain.car;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NameTest {

    @ParameterizedTest
    @ValueSource(strings = {"abcdef", ""})
    @DisplayName("이름이 1글자가 안되거나 5글자를 넘어갈 경우 익셉션을 제대로 처리하는지")
    void nameLimitTest(String name) {
        assertThatThrownBy(() -> {
            new Name(name);
        }).isInstanceOf(IllegalArgumentException.class)
            .hasMessage("이름은 1자 이상 5자 이하여야 합니다.");
    }

    @Test
    @DisplayName("이름을 입력하지 않은 경우 익셉션이 제대로 처리되는지")
    void nullTest() {
        assertThatThrownBy(() -> {
            String nullString = null;
            new Name(nullString);
        }).isInstanceOf(IllegalArgumentException.class)
            .hasMessage("이름은 null값이 될 수 없습니다.");
    }

    @Test
    @DisplayName("이름에 띄어쓰기가 포함된 경우 익셉션이 제대로 처리되는지")
    void blankTest() {
        assertThatThrownBy(() -> {
            new Name("ab c");
        }).isInstanceOf(IllegalArgumentException.class)
            .hasMessage("이름에는 띄어쓰기가 포함될 수 없습니다.");
    }

    @Test
    @DisplayName("제대로 된 String이 들어갔을 때 잘 잘라서 이름 객체들을 생성하는지")
    void createNameObjects() {
        List<Name> namesCreated = Name.createNameObjects("a,b,c");
        Object[] names = namesCreated.stream().map(Name::getName).toArray();
        assertThat(names).contains("a","b","c");
    }
}
