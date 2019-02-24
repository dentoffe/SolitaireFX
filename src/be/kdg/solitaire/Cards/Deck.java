package be.kdg.solitaire.Cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck() {
        this.generateCards();
    }
    private void generateCards() {
        for (Suits suit: Suits.values()) {
            for (Ranks rank: Ranks.values()) {
                cards.add(new Card(suit,rank));
            }
        }

    }
    public void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> getCards() {
        return cards;
    }
}
