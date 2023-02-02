public class Main {
    public static void main(String[] args)  {
//От нашего дома и от дома мисс Рейчел повалил дым, будто поднялся туман от реки, и к ним уже тянули шланги.
        InanimateCharacters Well = new InanimateCharacters("Колонка");
        InanimateCharacters HoseOne = new InanimateCharacters("шланг");
        HoseOne.setLocation(Well.name);
        InanimateCharacters HoseTwo = new InanimateCharacters("шланг");
        HoseTwo.setLocation(Well.name);
        House OurHouse = new House("Наш", "Дом");
        House HouseMissRachel = new House("Мисс Рейчел", "Дом");
        NaturalPhenomena Smoke = new NaturalPhenomena(HouseMissRachel.name, OurHouse.name, "Повалил", "дым", "now");
        OurHouse.setCondition(0, OurHouse.nameWhose, OurHouse.name);
        HouseMissRachel.setCondition(0, HouseMissRachel.nameWhose, HouseMissRachel.name);
        NaturalPhenomena Fog = new NaturalPhenomena("Поднялся", "туман", "от реки", "now");
        System.out.println(Fog.equals(Smoke));
        People All = new People("все");
        All.Move(All.name, "Тянули", HoseOne.name, HoseTwo.name);
        HoseOne.setLocation(OurHouse.name);
        HoseTwo.setLocation(HouseMissRachel.name);

//Позади нас взвизгунли шины, из-за угла вынеслась пожарная машина из Эбботсвила и остановилась напротив нашего дома.
        FireEngine FireEngine = new FireEngine("пожарная машина");
        FireEngine.setLocation("Эбботсвил");
        FireEngine.Wheels wheels = FireEngine.new Wheels();
        wheels.sound();
        FireEngine.Move("вынеслась","из-за угла", FireEngine.name);
        FireEngine.setLocation(OurHouse.name);

//- Книжка... - сказала я.
//- Какая книжка? - спросил Джим.
//- Про Тома Свифта... она не моя, а Дила...
//- Подожди волноваться, Глазастик, - сказал Джим.
        People Scout = new People("Глазастик");
        People Jem = new People("Джим");
        Scout.setLocation("одна сторона улицы");
        Jem.setLocation("одна сторона улицы");
        Scout.setCondition(0,Scout.name);
        InanimateCharacters Book = new InanimateCharacters("Дила");
        try {
            Scout.read(Book.name);
        } catch (WrongBookException e) {
            System.out.println(e.getMessage());
            System.out.println("Владелец книжек Глазастик?" + " " + Scout.mistake);
        }
        Scout.setCondition(Scout.name, 0);
        Scout.setCondition(1,Scout.name);
        Jem.setCondition(0,Jem.name);
        Scout.setCondition(Scout.name, 1);
        Jem.setCondition(1,Jem.name);

//И показал пальцем: - Гляди-ка!
        HumanBody finger = new HumanBody("палец", Jem.name);
        HumanBody eyes = new HumanBody("глаза", Scout.name);
        finger.setDirection("направление", 30);
        Jem.setCondition(0,Jem.name);
        if (Math.random()<0.9){
            eyes.setDirection("направление", 30);
        }
        Jem.setCondition(1,Jem.name);

//Среди соседей, сунув руки в карманы пальто, стоял Аттикус.
        People Atticus = new People("Аттикус", 53);
        Atticus.Move(Atticus.name, "стоял");
        if (Atticus.check(Atticus.Action)){
            HumanBody AtticusArms = new HumanBody("руки",Atticus.name,"карманы пальто");
        }

//Вид у него был такой, будто он смотрит футбол.
        View AtticusView = new View() {
            @Override
            public String move() {
                class FootballFan{
                    public void lookFootball(){
                        System.out.println("смотрит футбол");
                    }
                    public void lookFire(){
                        System.out.println("смотрит на пожар");
                    }
                    @Override
                    public int hashCode() {
                        int point = (int)Math.round(Math.random());
                        return point;
                    }
                }
               FootballFan FootballFan = new FootballFan();
                if (FootballFan.hashCode()>0){
                    System.out.println("вид был");
                    FootballFan.lookFootball();
                }
                else {
                    System.out.println("вид был");
                    FootballFan.lookFire();
                }
                return "был";
            }
        };
        AtticusView.move();

//Рядом стояла мисс Моди.
        People missMody = new People("мисс Моди");
        missMody.setLocation("рядом");
        missMody.Move(missMody.name, "стояла", missMody.Location);

//- Видишь, он пока не волнуется, - сказал Джим
        Jem.setCondition(0,Jem.name);
        if (5<10) {
            Atticus.setCondition(Atticus.name, 1);
        }

//- А почему он не на крыше?
//- Он слишком старый, он сломает себе шею.
        Scout.setCondition(0,Scout.name);
        if (Atticus.getAge() > 50) {
            Atticus.setLocation("земля");
        }
        else Atticus.setLocation("крыша");
        Jem.setCondition(1,Jem.name);
        Scout.setCondition(1,Scout.name);

//- Может, скажем ему, что надо вытаскивать вещи?
//- Нечего к нему приставать, он жсам знает, когда вытаскивать, - сказал Джим.
        Jem.setAction("не приставать");
        Atticus.setAction("знает");
        if (Jem.speak(Jem.Action) && Jem.speak(Atticus.Action)){
            Scout.setAction("скажем");
        }
        else Scout.setAction("не приставать");

//Эбботсвилские пожарные начали поливать водой наш дом; какой-то человек стоял на крыше и показывал, куда первым делом лить.
        People Someone = new People("какой-то человек");
        Someone.Move(Someone.name, "показывал", "направление");
        People firefighters = new People("пожарные", "Эбботсвил");
        firefighters.setAction("поливать дом водой");
        FireEngine.Move("поливать", Someone.Location, FireEngine.name);
        HoseOne.setCondition("с водой");

//Наш Самый Настоящий Мофродит почернел и развалился, соломенная шляпа мисс Моди так и осталась лежать на куче грязи.
// Садовых ножниц не было видно.
        People Snowman = new People("Снеговик");
        HumanBody SnowmanHead = new HumanBody("голова снеговика");
        InanimateCharacters hat = new InanimateCharacters("Шляпа");
        hat.setLocation(SnowmanHead.name);
        HumanBody SnowmanArm = new HumanBody("рука снеговика");
        InanimateCharacters scissors = new InanimateCharacters("ножницы");
        scissors.setLocation(SnowmanArm.name);
        Snowman.setCondition(Snowman.name, "почернел");
        Snowman.setCondition(Snowman.name, "развалился");
        scissors.setLocation("не видно");
        hat.setLocation("куча грязи");

//Между домами мисс Моди, мисс Рейчел и нашим было так жарко, что все давно скинули пальто и купальные халаты,
// работали в пижамах или в ночных рубашках, заправленных в штаны.
        House HouseMissMody = new House(missMody.name, "дом");
        All.setLocation(HouseMissRachel.name + "между" + HouseMissMody.name);
        All.setClothes(All.name, "пальто и купальные халаты");
        All.setAction("работали");
        if (All.getAction() == "работали") {
            All.setCondition(All.name, "жарко");
            All.setClothes(All.name, "пижамы или ночные рубашки");
        }

//А я все стояла на одном место и совсем закоченела.
//Джим обнял меня за плечи и старался согреть, но это не помогало.
//Я высвободилась иобхватила себя обеими руками.
//Начала приплясывать, и ноги понемногу согрелись.
        Scout.setCondition(Scout.name, "холодно");
        HumanBody ScoutShoulders = new HumanBody("плечи Глазастика");
        HumanBody JemArms = new HumanBody("руки Джима");
        HumanBody ScoutArms = new HumanBody("руки Глазастика");
        JemArms.setLocation(ScoutShoulders.name);
        HumanBody ScoutLegs = new HumanBody("ноги");
        int i = 1;
        while (i < 3) {
            if (JemArms.getLocation() == ScoutShoulders.name) {
                Scout.setCondition(Scout.name, "холодно");
                ScoutLegs.cold();
            } else {
                ScoutArms.setLocation(ScoutShoulders.name);
                Scout.setAction("приплясывать");
                Scout.setCondition(Scout.name, "тепло");
                ScoutLegs.setCondition(ScoutLegs.name, "согрелись");
            }
            JemArms.setLocation("свободны");
            i++;
        }

//Прикатила еще одна пожарная машина и остановилась перед домом мисс Стивени Кроуфорд.
        FireEngine FireEngineAnother = new FireEngine(" еще одна пожарная машина");
        House HouseMissStephenieCrawford = new House("мисс Стивени Кроуфорд", "дом");
        FireEngineAnother.setAction("прикатила");
        FireEngineAnother.setLocation(HouseMissStephenieCrawford.name);

//Колонка была только одна, не к чему прикрутить второй шланг, и пожарне стали поливать дом мисс Стивени из огнетушителей.
        Well.setQuantity(1);
        if (Well.getQuantity() > 1) {
            HoseTwo.setCondition("с водой");
        }
        else {
            InanimateCharacters FireExtinguishers = new InanimateCharacters("огнетушители");
            firefighters.getAction();
            FireExtinguishers.setCondition("работают");
            System.out.println("используются" + " " + FireExtinguishers.name);
        }

//Железная крыша мисс Моди преградила путь огню.
        InanimateCharacters roof = new InanimateCharacters("крыша");
        roof.Move(roof.name, "stop огонь");

//Дом с грохотом рухнул; пламя брызнуло во все стороны;
// на соседних крышах люди накинулись с одеялами на летящие искры и головешки.
        HouseMissMody.setCondition(2, HouseMissMody.nameWhose, HouseMissMody.name);
        House pit = new House( HouseMissMody.name,"яма");
        NaturalPhenomena fire = new NaturalPhenomena("брызнуло","пламя");
        All.setAction("накинулись на" + " " + fire.name);

//Только когда рассвело, все начали понемногу расходиться.
        NaturalPhenomena sky = new NaturalPhenomena("рассвело", "небо");
        if (sky.getCondition() == "рассвело"){
            All.setAction("уходить");
            All.setLocation("свои дома");
        }

//Мэйкобскую пожарную машину покатили обратно.
        firefighters.setAction("покатили машину");
        FireEngineAnother.setAction("перемещение");
        FireEngineAnother.setLocation("Мэйкоб");

        FireEngine FireEngineThree = new FireEngine("пожарная машина");
        FireEngineThree.setLocation("Мэйкоб");
//Эбботсвилская уехала сама, третья осталась.
        FireEngine.setAction("перемещение");
        FireEngine.setLocation("Эбботсвил");
        FireEngineThree.getLocation();

//Днем мы узнали - она приехала из Кларк-Фери, за шестьдесят миль.
        FireEngineThree.setAction("перемещение");
        FireEngineThree.setLocation("Кларк-Фери");

//Мы с Джимом тихонько перешли улицу.
        Scout.setAction("идти");
        Jem.setAction("идти");
        Scout.setLocation("другая сторона улицы");
        Jem.setLocation("другая сторона улицы");

//Мисс Моди стояла и смотрела на черную яму, которая дымилась посреди ее двора,
        pit.setCondition("дымится");
        missMody.Move(missMody.name, "стояла и смотрела", pit.name);

// и Аттикус покачал головой - значит, говорить с ней не надо.
        HumanBody AtticusHead = new HumanBody("голова" + " " + Atticus.name);
        AtticusHead.setCondition(AtticusHead.name,"качается");
        if (AtticusHead.getCondition() == "качается"){
            Scout.setAction("молчит");
        }
        else Scout.setAction("говорит");

//Он повел нас домой, а сам держался за наши плечи, потому что мостовая была очень скользкая.
        Atticus.Move(Atticus.name, "повел", OurHouse.name);
        Atticus.setAction("идет");
        Scout.setAction("идет");
        Jem.setAction("идет");
        Street pavement = new Street() {
            @Override
            public String fall() {
                System.out.println("мостовая скользкая");
                return "мостовая скользкая";
            }
        };
        if (pavement.fall() == "мостовая скользкая"){
            HumanBody JemShoulders = new HumanBody("плечи" + " " + Jem.name);
            HumanBody AtticusPalmLeft = new HumanBody("левая ладонь");
            HumanBody AtticusPalmRight = new HumanBody("правая ладонь");
            AtticusPalmLeft.setLocation(JemShoulders.name);
            AtticusPalmRight.setLocation(ScoutShoulders.name);
        }

//Он сказал - мисс Моди пока поживет у мисс Стивени.
//Потом спросил:
//- Кто хочет горячего какао?
        Atticus.setAction("говорит");
        missMody.setLocation(HouseMissStephenieCrawford.name);
        Atticus.setAction("молчит");
        Atticus.setAction("спрашивает");
        //Atticus.Move(Scout.name + " " + Jem.name, "хотеть горячего какао?");
        System.out.println(Atticus);
    }
}