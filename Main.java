public class Main {
    public static void main(String[] args)  {
//�� ������ ���� � �� ���� ���� ������ ������� ���, ����� �������� ����� �� ����, � � ��� ��� ������ ������.
        InanimateCharacters Well = new InanimateCharacters("�������");
        InanimateCharacters HoseOne = new InanimateCharacters("�����");
        HoseOne.setLocation(Well.name);
        InanimateCharacters HoseTwo = new InanimateCharacters("�����");
        HoseTwo.setLocation(Well.name);
        House OurHouse = new House("���", "���");
        House HouseMissRachel = new House("���� ������", "���");
        NaturalPhenomena Smoke = new NaturalPhenomena(HouseMissRachel.name, OurHouse.name, "�������", "���", "now");
        OurHouse.setCondition(0, OurHouse.nameWhose, OurHouse.name);
        HouseMissRachel.setCondition(0, HouseMissRachel.nameWhose, HouseMissRachel.name);
        NaturalPhenomena Fog = new NaturalPhenomena("��������", "�����", "�� ����", "now");
        System.out.println(Fog.equals(Smoke));
        People All = new People("���");
        All.Move(All.name, "������", HoseOne.name, HoseTwo.name);
        HoseOne.setLocation(OurHouse.name);
        HoseTwo.setLocation(HouseMissRachel.name);

//������ ��� ���������� ����, ��-�� ���� ��������� �������� ������ �� ���������� � ������������ �������� ������ ����.
        FireEngine FireEngine = new FireEngine("�������� ������");
        FireEngine.setLocation("���������");
        FireEngine.Wheels wheels = FireEngine.new Wheels();
        wheels.sound();
        FireEngine.Move("���������","��-�� ����", FireEngine.name);
        FireEngine.setLocation(OurHouse.name);

//- ������... - ������� �.
//- ����� ������? - ������� ����.
//- ��� ���� ������... ��� �� ���, � ����...
//- ������� �����������, ���������, - ������ ����.
        People Scout = new People("���������");
        People Jem = new People("����");
        Scout.setLocation("���� ������� �����");
        Jem.setLocation("���� ������� �����");
        Scout.setCondition(0,Scout.name);
        InanimateCharacters Book = new InanimateCharacters("����");
        try {
            Scout.read(Book.name);
        } catch (WrongBookException e) {
            System.out.println(e.getMessage());
            System.out.println("�������� ������ ���������?" + " " + Scout.mistake);
        }
        Scout.setCondition(Scout.name, 0);
        Scout.setCondition(1,Scout.name);
        Jem.setCondition(0,Jem.name);
        Scout.setCondition(Scout.name, 1);
        Jem.setCondition(1,Jem.name);

//� ������� �������: - �����-��!
        HumanBody finger = new HumanBody("�����", Jem.name);
        HumanBody eyes = new HumanBody("�����", Scout.name);
        finger.setDirection("�����������", 30);
        Jem.setCondition(0,Jem.name);
        if (Math.random()<0.9){
            eyes.setDirection("�����������", 30);
        }
        Jem.setCondition(1,Jem.name);

//����� �������, ����� ���� � ������� ������, ����� �������.
        People Atticus = new People("�������", 53);
        Atticus.Move(Atticus.name, "�����");
        if (Atticus.check(Atticus.Action)){
            HumanBody AtticusArms = new HumanBody("����",Atticus.name,"������� ������");
        }

//��� � ���� ��� �����, ����� �� ������� ������.
        View AtticusView = new View() {
            @Override
            public String move() {
                class FootballFan{
                    public void lookFootball(){
                        System.out.println("������� ������");
                    }
                    public void lookFire(){
                        System.out.println("������� �� �����");
                    }
                    @Override
                    public int hashCode() {
                        int point = (int)Math.round(Math.random());
                        return point;
                    }
                }
               FootballFan FootballFan = new FootballFan();
                if (FootballFan.hashCode()>0){
                    System.out.println("��� ���");
                    FootballFan.lookFootball();
                }
                else {
                    System.out.println("��� ���");
                    FootballFan.lookFire();
                }
                return "���";
            }
        };
        AtticusView.move();

//����� ������ ���� ����.
        People missMody = new People("���� ����");
        missMody.setLocation("�����");
        missMody.Move(missMody.name, "������", missMody.Location);

//- ������, �� ���� �� ���������, - ������ ����
        Jem.setCondition(0,Jem.name);
        if (5<10) {
            Atticus.setCondition(Atticus.name, 1);
        }

//- � ������ �� �� �� �����?
//- �� ������� ������, �� ������� ���� ���.
        Scout.setCondition(0,Scout.name);
        if (Atticus.getAge() > 50) {
            Atticus.setLocation("�����");
        }
        else Atticus.setLocation("�����");
        Jem.setCondition(1,Jem.name);
        Scout.setCondition(1,Scout.name);

//- �����, ������ ���, ��� ���� ����������� ����?
//- ������ � ���� ����������, �� ���� �����, ����� �����������, - ������ ����.
        Jem.setAction("�� ����������");
        Atticus.setAction("�����");
        if (Jem.speak(Jem.Action) && Jem.speak(Atticus.Action)){
            Scout.setAction("������");
        }
        else Scout.setAction("�� ����������");

//������������� �������� ������ �������� ����� ��� ���; �����-�� ������� ����� �� ����� � ���������, ���� ������ ����� ����.
        People Someone = new People("�����-�� �������");
        Someone.Move(Someone.name, "���������", "�����������");
        People firefighters = new People("��������", "���������");
        firefighters.setAction("�������� ��� �����");
        FireEngine.Move("��������", Someone.Location, FireEngine.name);
        HoseOne.setCondition("� �����");

//��� ����� ��������� �������� �������� � ����������, ���������� ����� ���� ���� ��� � �������� ������ �� ���� �����.
// ������� ������ �� ���� �����.
        People Snowman = new People("��������");
        HumanBody SnowmanHead = new HumanBody("������ ���������");
        InanimateCharacters hat = new InanimateCharacters("�����");
        hat.setLocation(SnowmanHead.name);
        HumanBody SnowmanArm = new HumanBody("���� ���������");
        InanimateCharacters scissors = new InanimateCharacters("�������");
        scissors.setLocation(SnowmanArm.name);
        Snowman.setCondition(Snowman.name, "��������");
        Snowman.setCondition(Snowman.name, "����������");
        scissors.setLocation("�� �����");
        hat.setLocation("���� �����");

//����� ������ ���� ����, ���� ������ � ����� ���� ��� �����, ��� ��� ����� ������� ������ � ��������� ������,
// �������� � ������� ��� � ������ ��������, ������������ � �����.
        House HouseMissMody = new House(missMody.name, "���");
        All.setLocation(HouseMissRachel.name + "�����" + HouseMissMody.name);
        All.setClothes(All.name, "������ � ��������� ������");
        All.setAction("��������");
        if (All.getAction() == "��������") {
            All.setCondition(All.name, "�����");
            All.setClothes(All.name, "������ ��� ������ �������");
        }

//� � ��� ������ �� ����� ����� � ������ ����������.
//���� ����� ���� �� ����� � �������� �������, �� ��� �� ��������.
//� ������������� ���������� ���� ������ ������.
//������ ������������, � ���� ��������� ���������.
        Scout.setCondition(Scout.name, "�������");
        HumanBody ScoutShoulders = new HumanBody("����� ����������");
        HumanBody JemArms = new HumanBody("���� �����");
        HumanBody ScoutArms = new HumanBody("���� ����������");
        JemArms.setLocation(ScoutShoulders.name);
        HumanBody ScoutLegs = new HumanBody("����");
        int i = 1;
        while (i < 3) {
            if (JemArms.getLocation() == ScoutShoulders.name) {
                Scout.setCondition(Scout.name, "�������");
                ScoutLegs.cold();
            } else {
                ScoutArms.setLocation(ScoutShoulders.name);
                Scout.setAction("������������");
                Scout.setCondition(Scout.name, "�����");
                ScoutLegs.setCondition(ScoutLegs.name, "���������");
            }
            JemArms.setLocation("��������");
            i++;
        }

//��������� ��� ���� �������� ������ � ������������ ����� ����� ���� ������� ��������.
        FireEngine FireEngineAnother = new FireEngine(" ��� ���� �������� ������");
        House HouseMissStephenieCrawford = new House("���� ������� ��������", "���");
        FireEngineAnother.setAction("���������");
        FireEngineAnother.setLocation(HouseMissStephenieCrawford.name);

//������� ���� ������ ����, �� � ���� ���������� ������ �����, � ������� ����� �������� ��� ���� ������� �� �������������.
        Well.setQuantity(1);
        if (Well.getQuantity() > 1) {
            HoseTwo.setCondition("� �����");
        }
        else {
            InanimateCharacters FireExtinguishers = new InanimateCharacters("������������");
            firefighters.getAction();
            FireExtinguishers.setCondition("��������");
            System.out.println("������������" + " " + FireExtinguishers.name);
        }

//�������� ����� ���� ���� ���������� ���� ����.
        InanimateCharacters roof = new InanimateCharacters("�����");
        roof.Move(roof.name, "stop �����");

//��� � �������� ������; ����� �������� �� ��� �������;
// �� �������� ������ ���� ���������� � �������� �� ������� ����� � ���������.
        HouseMissMody.setCondition(2, HouseMissMody.nameWhose, HouseMissMody.name);
        House pit = new House( HouseMissMody.name,"���");
        NaturalPhenomena fire = new NaturalPhenomena("��������","�����");
        All.setAction("���������� ��" + " " + fire.name);

//������ ����� ��������, ��� ������ ��������� �����������.
        NaturalPhenomena sky = new NaturalPhenomena("��������", "����");
        if (sky.getCondition() == "��������"){
            All.setAction("�������");
            All.setLocation("���� ����");
        }

//���������� �������� ������ �������� �������.
        firefighters.setAction("�������� ������");
        FireEngineAnother.setAction("�����������");
        FireEngineAnother.setLocation("������");

        FireEngine FireEngineThree = new FireEngine("�������� ������");
        FireEngineThree.setLocation("������");
//������������� ������ ����, ������ ��������.
        FireEngine.setAction("�����������");
        FireEngine.setLocation("���������");
        FireEngineThree.getLocation();

//���� �� ������ - ��� �������� �� �����-����, �� ���������� ����.
        FireEngineThree.setAction("�����������");
        FireEngineThree.setLocation("�����-����");

//�� � ������ �������� ������� �����.
        Scout.setAction("����");
        Jem.setAction("����");
        Scout.setLocation("������ ������� �����");
        Jem.setLocation("������ ������� �����");

//���� ���� ������ � �������� �� ������ ���, ������� �������� ������� �� �����,
        pit.setCondition("�������");
        missMody.Move(missMody.name, "������ � ��������", pit.name);

// � ������� ������� ������� - ������, �������� � ��� �� ����.
        HumanBody AtticusHead = new HumanBody("������" + " " + Atticus.name);
        AtticusHead.setCondition(AtticusHead.name,"��������");
        if (AtticusHead.getCondition() == "��������"){
            Scout.setAction("������");
        }
        else Scout.setAction("�������");

//�� ����� ��� �����, � ��� �������� �� ���� �����, ������ ��� �������� ���� ����� ���������.
        Atticus.Move(Atticus.name, "�����", OurHouse.name);
        Atticus.setAction("����");
        Scout.setAction("����");
        Jem.setAction("����");
        Street pavement = new Street() {
            @Override
            public String fall() {
                System.out.println("�������� ���������");
                return "�������� ���������";
            }
        };
        if (pavement.fall() == "�������� ���������"){
            HumanBody JemShoulders = new HumanBody("�����" + " " + Jem.name);
            HumanBody AtticusPalmLeft = new HumanBody("����� ������");
            HumanBody AtticusPalmRight = new HumanBody("������ ������");
            AtticusPalmLeft.setLocation(JemShoulders.name);
            AtticusPalmRight.setLocation(ScoutShoulders.name);
        }

//�� ������ - ���� ���� ���� ������� � ���� �������.
//����� �������:
//- ��� ����� �������� �����?
        Atticus.setAction("�������");
        missMody.setLocation(HouseMissStephenieCrawford.name);
        Atticus.setAction("������");
        Atticus.setAction("����������");
        //Atticus.Move(Scout.name + " " + Jem.name, "������ �������� �����?");
        System.out.println(Atticus);
    }
}