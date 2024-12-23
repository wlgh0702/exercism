package com.gamja.exercism;

/*
* Introduction
Booleans
Booleans in Java are represented by the boolean type, which values can be either true or false.

Java supports three boolean operators:

! (NOT): negates the boolean
&& (AND): takes two booleans and returns true if they're both true
|| (OR): returns true if any of the two booleans is true
Examples
!true // => false
!false // => true
true && false // => false
true && true // => true
false || false // => false
false || true // => true
Instructions
In this exercise, you'll implement the quest logic for a new RPG game that a friend is developing. The game's main character is Annalyn, a brave girl with a fierce and loyal pet dog. Unfortunately, disaster strikes: her best friend was kidnapped while searching for berries in the forest. Annalyn will try to find and rescue her friend, optionally taking her dog along on the quest.

After some time spent following the trail, Annalyn discovers the camp where her friend is imprisoned. It turns out there are two kidnappers: a mighty knight and a cunning archer.

Having found the kidnappers, Annalyn considers which of the following actions she can engage in:

Fast attack: a fast attack can be made if the knight is sleeping, as it takes time for him to put on his armor, leaving him vulnerable.
Spy: the group can be spied upon if at least one of them is awake. Otherwise, spying is a waste of time.
Signal prisoner: the prisoner can be signaled using bird sounds if the prisoner is awake and the archer is sleeping. Archers are trained in bird signaling and could intercept the message if they are awake.
Free prisoner: Annalyn can attempt to sneak into the camp to free the prisoner. This is risky and can only succeed in one of two ways:
If Annalyn has her pet dog, she can rescue the prisoner if the archer is asleep. The knight is scared of the dog and the archer will not have time to get ready before Annalyn and the prisoner can escape.
If Annalyn does not have her pet dog, then she and the prisoner must be very sneaky! Annalyn can free the prisoner if the prisoner is awake and both the knight and archer are sleeping. However, if the prisoner is sleeping, they can't be rescued, as the prisoner would be startled by Annalyn's sudden appearance and wake up the knight and archer.
You have four tasks: to implement the logic for determining if the above actions are available based on the state of the three characters in the forest and whether Annalyn's pet dog is present or not.


* */
class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (!knightIsAwake && !archerIsAwake && prisonerIsAwake) || (!archerIsAwake && petDogIsPresent);
    }
}

