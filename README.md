# PokemonBST

Sample Output

Test Code:
      readPokemonCSV();
      myPokemonTree.inorder();
      Pokemon found = myPokemonTree.searchPokemon("Xatu");
      System.out.println(found);

Output:
(... more pokemon in non-decreasing order omitted for brevity)
Xatu (total=470, speed=95)
Xerneas (total=680, speed=99)
Yamask (total=303, speed=30)
Yanma (total=390, speed=95)
Yanmega (total=515, speed=95)
Yveltal (total=680, speed=99)
Zangoose (total=458, speed=90)
Zapdos (total=580, speed=100)
Zebstrika (total=497, speed=116)
Zekrom (total=680, speed=90)
Zigzagoon (total=240, speed=60)
Zoroark (total=510, speed=105)
Zorua (total=330, speed=65)
Zubat (total=245, speed=55)
Zweilous (total=420, speed=58)
Zygarde50% Forme (total=600, speed=95)
Comparisons made: 10
Xatu (total=470, speed=95)

Test Code:
    readPokemonCSV();
    myPokemonTree.inorder();
    Pokemon found = myPokemonTree.searchPokemon("Not a pokemon");
    System.out.println(found);

Output:
(... more pokemon in non-decreasing order omitted for brevity)
Xatu (total=470, speed=95)
Xerneas (total=680, speed=99)
Yamask (total=303, speed=30)
Yanma (total=390, speed=95)
Yanmega (total=515, speed=95)
Yveltal (total=680, speed=99)
Zangoose (total=458, speed=90)
Zapdos (total=580, speed=100)
Zebstrika (total=497, speed=116)
Zekrom (total=680, speed=90)
Zigzagoon (total=240, speed=60)
Zoroark (total=510, speed=105)
Zorua (total=330, speed=65)
Zubat (total=245, speed=55)
Zweilous (total=420, speed=58)
Zygarde50% Forme (total=600, speed=95)
Pokemon not found!
Comparisons made: 19
null
