package edu.kis.vh.nursery;

/**
 * Klasa HanoiRhymer rozszerza zachowanie klasy DefaultCountingOutRhymer poprzez dodanie mechanizmu zliczania odrzuconych elementów.
 * Element zostaje odrzucony w sytuacji, gdy:
 * stos nie jest pusty (callCheck() == false) oraz wartość wejściowa jest większa od aktualnego wierzchołka stosu (peekaboo())
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * Licznik odrzuconych wartości (niezapisanych na stosie).
     */
    private int totalRejected = 0;

    /**
     * Zwraca liczbę elementów, które zostały odrzucone podczas próby dodania na stos.
     *
     * @return liczba odrzuconych elementów
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Dodaje element na stos.
     * Jeżeli stos nie jest pusty i nowa wartość jest większa od
     * aktualnego wierzchołka stosu, element zostaje odrzucony i
     * zwiększany jest licznik odrzuceń.
     * W przeciwnym wypadku element zostaje dodany na stos.
     *
     * @param in wartość dodawana do stosu
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
