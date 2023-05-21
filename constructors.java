public class constructors {
  public static void main(String [] args){
    DemoClass demoClass1 = new DemoClass();
    DemoClass demoClass2 = new DemoClass("Akhil Gupta", 26);
    DemoClass demoClass3 = new DemoClass(demoClass2);

    System.out.println("🎈Object of Default Constructor: " + demoClass1);
    System.out.println("🎉Object of Parameterized Constructor: " + demoClass2);
    System.out.println("🎊Object of Copy Constructor: " + demoClass3);

    demoClass1.callPrivateConstructor();
    demoClass2.callPrivateConstructor();
  }
}


class DemoClass{
  int age; String name;

  /// Default Constructor
  DemoClass(){
    age = 21;
    name = "Ashutosh Gupta";
    System.out.println("Default Constructor Called.🏆");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }

  /// Parameterized Constructor
  DemoClass (String name, int age){
    this.name = name;
    this.age = age;
    System.out.println("Parameterized Constructor Called.🌟");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }

  /// Copy Constructor - A copy constructor in a Java class is a constructor that creates an object using another object of the same Java class.
  /// That's helpful when we want to copy a complex object that has several fields, or when we want to make a deep copy of an existing object.
  DemoClass(DemoClass demoClass){
    System.out.println("Copy Constructor Called.🎁");
    demoClass.printHelloWorld();
  }

  /// Private Constructor
  private DemoClass(String name){
    this.name = name;
    this.age = 22;
    System.out.println("Private Constructor Called.😇");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }

  void callPrivateConstructor(){
    DemoClass demoClass = new DemoClass("Anubhav Singh");
    demoClass.printHelloWorld();
  }

  void printHelloWorld(){
    System.out.println("Hello😀 World!");
  }
}

/// [😀 😃 😄 😁 😆 😅 😂 🤣 😊 😇 🙂 🙃 😉 😌 😍 😘 😗 😙 😚 😋 😛 😝 😜 🤪 🤨 🧐 🤓 😎 🤩 😏 😒 😞 😔 😟 😕 🙁 ☹️ 😣 😖 😫 😩 🥺 😢 😭 😤 😠 😡 🤬 😱 😨 😰 😥 😓 🤗 🤔 🙄 😯 😦 😧 😮 😲 😴 😪 😵 🥴 😌 😛 😜 😝 🤤 😒 😓 😔 😕 😖 😞 😟 😤 😢 😭 😦 😧 😨 😩 😬 😰 😱 🥵 🥶 😳 🤯 🤠 🥳 😎 🤓 🧐 😕 😟 🙁 😮 😣 😫 😩 😢 😭 😤 😠 😡 🤬 😈 👿 🤡 🤠 💩 😺 😸 😹 😻 😼 😽 🙀 😿 😾 🤲 🤝 🙏 👍 👎 👊 ✊ 🤛 🤜 🤞 ✌️ 🤘 🤟 🖐 ✋ 🖖 👋 🤚 🖕 🤙 💪 🦾 🦿 🖐️ 🤚 🖖 ✌️ 🤞 🤟 🤘 👍 👎 ✊ 🤛 🤜 🤌 🤏 🙌 👏 🙏 🤝 👐 🧑‍🤝‍🧑👐 🤲 💅 🦶 🦵 💄 💋 👄 🦷 🦴 👁️ 👀 🧠 🦾 🫀 🫁 🦻 👂 🦿 👃 🫂 🧔 👣 🌞 🌝 🌛 🌜 🌚 🌕 🌖 🌗 🌘 🌑 🌒 🌓 🌔 🌙 🌎 🌍 🌏 🪐 💫 ⭐ 🌟 🌠 🌌 🎆 🎇 🧨 ✨ 🎈 🎉 🎊 🎀 🎁 🎗 🎟 🎫 🎖 🏆 🏅 🥇 🥈 🥉 ⚽ ⚾ 🥎 🏀 🏐 🏈 🏉 🎾 🥏 🎳 🏏 🏑 🏒 🥍 🏓 🏸 🥊 🥋 🎽 🛹 🥌 🎯 🪀 🪁 🏹 🎮 🕹️ 🎰 🎲 🧩 🎴 🀄 🎭 🖼️ 🎨 🧵 🧶 👓 🕶️ 🥽 🥼 🦺 👔 👕 👖 🧣 🧤 🧥 🧦 👗 👘 🥻 🩱 🩲 🩳 👙 👚 👛 👜 🩴 🥿 👠 👡 🩰 🪖 🪗 🩹 🩺 🪡 🪢 🩻 🩼 🪙 🪚 🪛 🪜 🪞 🪟 🪠 🪤 🪄 🪥 🪦 🪧 🪓 🪖 🪆 🪇 🪔]