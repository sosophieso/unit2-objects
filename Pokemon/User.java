import greenfoot.*;

public class User extends Actor
{
    private String name;
    private Pokemon pokemon;

    public User(String name) {
        this.name = name;
    }

    public void setPokemon(Pokemon p) {
        this.pokemon = p;
    }

    public Pokemon getPokemon() {
        return this.pokemon;
    }

    public void switchPokemon(Pokemon newPokemon) {
        this.pokemon = newPokemon;
    }

    public void heal() {
        this.pokemon.heal();
    }

    public void attack(String name, User enemy) {
        this.pokemon.attack(name, enemy);
    }

    public boolean isEndGame() {
        return this.pokemon.isOut();
    }

    public String getName() {
        return this.name;
    }
}