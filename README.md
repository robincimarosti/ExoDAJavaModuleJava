Bon, on a récupéré une mission pas terrible...


Le PO nous a confié ce code de jeu d'échec fait par son fils dans le cadre d'un examen.
Il est bien parti, mais il manque des choses. 

Le PO nous a demandé de donner un coup de main à son prodige, afin qu'il puisse enfin valider l'UE de Java qu'il repasse pour la quatrième année.

Le code est par endroit très propre, par endroit c'est un enfer.


--Ne te laisse pas impressioner par la logique métier en place. Plein de code semble bon(logique des mouvements, création/print de l'échiquier...), inutile de la modifier (mais il faut identifier pour ne pas la modifier!)--

Quoi qu'il en soit, il faut :

.Réparer les erreurs et faire en sorte que le projet se lance.
//modification sur la main avec la bonne methode main.
Comme c'est un projet scolaire, il faut être carré avec les normes :
.Netoyer le code.
//netoyage du code avec l'autocomplétion en passant le curseur sur les erreurs et en modifiant coorectement les zone rouge, ajout des getter et setter sur sur les attributs de classe qui en ont besoin. 

.Un seul package... Imagine!
// construction d'un nouveau package modele avec les logique metier intégrer 
.Par contre, il a mélangé anglais/francais. J'ai vu un endroit où ca coinçait, je sais plus où (un switch?).
changement dans le switch des nom en anglais en francais dans la classe echiquier.
En fonctionnalités manquantes, on a :
.Un petit DDC informel serait pas mal, histoire d'y voir plus clair?
mise en place d'un diagramme de classe pour clarifier les heritage et relation du package modele.
.Le nom des joueurs est impersonel, il faudrait demander aux joueurs pour personnaliser. Ca serait pas mal de mettre en place une page qui recence tous les joueurs.
Instanciation de nouveaux joueurs au debut du jeu pour donner le prenom de chaque joueur.
.Je ne sais pas comment il a fait, mais toutes les pièces ont du code sauf la Reine. Apres, c'est un mix entre la Tour et le Fou, ca devrait être faisable.
// mise en place des fonctionnalité et des bon mouvement de la reine reprise du code du fou et ajoue des deplacement de la tour pour que elle puisse conjugé les deplacements de la tour ainsi que ceux du fou.
.Il serait pas mal de faire un petit blabla à destination du fiston, pour qu'il sache ce qu'"il" a fait sur "son" projet. Avec un avis général+quelques détails sur le code, ca peut être pas mal.

Tu t'y prends comme tu veux, mais le projet doit être prêt aujourd'hui.
ps: j'ai enelever l'implementation de chaque piece car ceux ci etende directement de piece qui elle meme implémente le mouvement du coup pas besoin d'implementer sur classe fille si la classe mere implemente deja le mouvement. evite la repetition de code. 