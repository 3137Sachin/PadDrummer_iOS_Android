//
//  ViewController.swift
//  Pad-Drummer
//
//  Created by Sachin Karki on 4/21/20.
//  Copyright © 2020 SachinKarki. All rights reserved.
//

import UIKit
import AVFoundation

//This is the main class that includes every method and every class for every screens

//Class for the main bar view controller but is not needed
class BarViewController: UIViewController {
    override func viewDidLoad() {
          super.viewDidLoad()
        
    }
}

//Class for the Tips Screen
class Tips_ViewController: UIViewController {
   
    //Toasting the message. HERE AGAIN USING A RESUABLE CODE/FUCNTION IN DIFFERENT SCREENS
    @IBAction func Toast(_ sender: Any) {
        ToastView.shared.short(self.view, txt_msg: "Thanks!!")
    }

    override func viewDidLoad() {
          super.viewDidLoad()

        //A function used in this class too (Reusable code in two different screens)
               self.HideKeyboard()
        
    }
}

//A function that automatically hides the keyboard when pressing outside area which can be used in any class
extension UIViewController{
    func HideKeyboard()  {
        
        let Tap:UITapGestureRecognizer = UITapGestureRecognizer(target: self , action: #selector(DismissKeyboard))
        view.addGestureRecognizer(Tap)
    }
    
    //Object function to dismiss the keyboard
    @objc func DismissKeyboard(){
           view.endEditing(true)
       }
}

//Class for the Feedback Screen
class Feedback_ViewController: UIViewController {
    
    @IBOutlet weak var PickerTextField: UITextField!
    
    //Using an array to put items in the picker view
    let picks = ["Main Kit",
                "Guitar Kit"]
    
    var selected: String?
    
    //Display the toast message
    @IBAction func Toast(_ sender: Any) {
        ToastView.shared.long(self.view, txt_msg: "Thanks for the Feedback!")
    }
    
    
    override func viewDidLoad() {
          super.viewDidLoad()
        
        //A function used in this class
        self.HideKeyboard()
        
        //Calling a Picker Function
        createPicker()
        
        
        
    }
    
    //Picker function to choose between the two kits
    func createPicker(){
        let pickers = UIPickerView()
        pickers.delegate = self
        
        PickerTextField.inputView = pickers
    }
    
}

//An extension for the picker view to be used in feedback
extension Feedback_ViewController: UIPickerViewDataSource, UIPickerViewDelegate{
    
    //a function for the picker view that selects just one item
    func numberOfComponents(in pickerView: UIPickerView) -> Int {
        return 1
    }
    
    //lists the total number of items in the array
    func pickerView(_ pickerView: UIPickerView, numberOfRowsInComponent component: Int) -> Int {
        return picks.count
    }
    
    //returns the items in the array
    func pickerView(_ pickerView: UIPickerView, titleForRow row: Int, forComponent component: Int) -> String? {
        return picks[row]
    }
    
    //selects the item in the array for the picker view
    func pickerView(_ pickerView: UIPickerView, didSelectRow row: Int, inComponent component: Int) {
        selected = picks[row]
        PickerTextField.text = selected
    }
    
    
    
}

//Class for the Guitar Kit Screen
class GuitarKit_ViewController: UIViewController {
    
    //Initializing the audio assests with the ios audio player
    var sound_01: AVAudioPlayer = AVAudioPlayer()
    var sound_02: AVAudioPlayer = AVAudioPlayer()
    var sound_03: AVAudioPlayer = AVAudioPlayer()
    var sound_10: AVAudioPlayer = AVAudioPlayer()
    var sound_11: AVAudioPlayer = AVAudioPlayer()
    var sound_12: AVAudioPlayer = AVAudioPlayer()
    var sound_13: AVAudioPlayer = AVAudioPlayer()
    var sound_14: AVAudioPlayer = AVAudioPlayer()
    var sound_15: AVAudioPlayer = AVAudioPlayer()

    //A function that loads the sounds onto the audio player for individual sounds
    //In Android Studio I used SoundPool instead of media player which was a big mistake
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        //Dispose of any resources that can be created
    }
    
    //Connecting each buttons onto each different sound
    //Note that information from the Home Kit is used on this one as well for Sound 1,2,3 (Same Sounds)
    @IBAction func Sound01(_ sender: Any) {
        do {
        //initialize the wav file onto a container
        let soundone = Bundle.main.path(forResource: "sound1", ofType: ".WAV")
        
        //a small function that plays the sound
        try sound_01 = AVAudioPlayer(contentsOf: URL(fileURLWithPath : soundone!))
               sound_01.play()
          } catch {
              print(error)
          }
    }
    
    //A method for another button which plays differnt sound
    @IBAction func Sound02(_ sender: Any) {
        do {
        let soundtwo = Bundle.main.path(forResource: "sound2", ofType: ".WAV")
        try sound_02 = AVAudioPlayer(contentsOf: URL(fileURLWithPath : soundtwo!))
               sound_02.play()
          } catch {
              print(error)
          }
    }
    
    //A method for another button which plays differnt sound
    @IBAction func Sound03(_ sender: Any) {
        do {
        let soundthree = Bundle.main.path(forResource: "sound3", ofType: ".WAV")
        try sound_03 = AVAudioPlayer(contentsOf: URL(fileURLWithPath : soundthree!))
               sound_03.play()
          } catch {
              print(error)
          }
    }
    
    //A method for another button which plays differnt sound
    @IBAction func Sound10(_ sender: Any) {
        do {
        let soundten = Bundle.main.path(forResource: "sound10", ofType: ".wav")
        try sound_10 = AVAudioPlayer(contentsOf: URL(fileURLWithPath : soundten!))
               sound_10.play()
          } catch {
              print(error)
          }
    }
    
    //A method for another button which plays differnt sound
    @IBAction func Sound11(_ sender: Any) {
        do {
        let soundeleven = Bundle.main.path(forResource: "sound11", ofType: ".wav")
        try sound_11 = AVAudioPlayer(contentsOf: URL(fileURLWithPath : soundeleven!))
               sound_11.play()
          } catch {
              print(error)
          }
    }
    
    
    @IBAction func Sound12(_ sender: Any) {
        do {
        let soundtwelve = Bundle.main.path(forResource: "sound12", ofType: ".wav")
        try sound_12 = AVAudioPlayer(contentsOf: URL(fileURLWithPath : soundtwelve!))
               sound_12.play()
          } catch {
              print(error)
          }
    }
    
    @IBAction func Sound13(_ sender: Any) {
        do {
        let soundthirteen = Bundle.main.path(forResource: "sound13", ofType: ".wav")
        try sound_13 = AVAudioPlayer(contentsOf: URL(fileURLWithPath : soundthirteen!))
               sound_13.play()
          } catch {
              print(error)
          }
    }
    
    //A method for another button which plays differnt sound
    @IBAction func Sound14(_ sender: Any) {
        do {
        let soundfourteen = Bundle.main.path(forResource: "sound14", ofType: ".wav")
        try sound_14 = AVAudioPlayer(contentsOf: URL(fileURLWithPath : soundfourteen!))
               sound_14.play()
          } catch {
              print(error)
          }
    }
    
    
    @IBAction func Sound15(_ sender: Any) {
        do {
        let soundfifteen = Bundle.main.path(forResource: "sound15", ofType: ".wav")
        try sound_15 = AVAudioPlayer(contentsOf: URL(fileURLWithPath : soundfifteen!))
               sound_15.play()
          } catch {
              print(error)
          }
    }
    
    }


//Class for the Main Kit Screen
class MainKit_ViewController: UIViewController {
    
    //Initializing the audio assests with the ios audio player
    var sound_01: AVAudioPlayer = AVAudioPlayer()
    var sound_02: AVAudioPlayer = AVAudioPlayer()
    var sound_03: AVAudioPlayer = AVAudioPlayer()
    var sound_04: AVAudioPlayer = AVAudioPlayer()
    var sound_05: AVAudioPlayer = AVAudioPlayer()
    var sound_06: AVAudioPlayer = AVAudioPlayer()
    var sound_07: AVAudioPlayer = AVAudioPlayer()
    var sound_08: AVAudioPlayer = AVAudioPlayer()
    var sound_09: AVAudioPlayer = AVAudioPlayer()

    //A function that loads the sounds onto the audio player for individual sounds
    //In Android Studio I used SoundPool instead of media player which was a big mistake
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        //Dispose of any resources that can be created
    }
    
    //Connecting each buttons onto each different sound
    //Note that information from the Guitar Kit is used on this one as well for Sound 1,2,3 (Same Sounds)
    @IBAction func Sound01(_ sender: Any) {
         do {
            //initialize the wav file onto a container
            let soundone = Bundle.main.path(forResource: "sound1", ofType: ".WAV")
            
            //a small function that plays the sound 
            try sound_01 = AVAudioPlayer(contentsOf: URL(fileURLWithPath : soundone!))
                   sound_01.play()
              } catch {
                  print(error)
              }
    }
    
    //This one is for another button
    @IBAction func Sound02(_ sender: Any) {
        do {
        let soundtwo = Bundle.main.path(forResource: "sound2", ofType: ".WAV")
        try sound_02 = AVAudioPlayer(contentsOf: URL(fileURLWithPath : soundtwo!))
               sound_02.play()
          } catch {
              print(error)
          }
    }
    
    //A method for another button which plays differnt sound
    @IBAction func Sound03(_ sender: Any) {
         do {
               let soundthree = Bundle.main.path(forResource: "sound3", ofType: ".WAV")
               try sound_03 = AVAudioPlayer(contentsOf: URL(fileURLWithPath : soundthree!))
                      sound_03.play()
                 } catch {
                     print(error)
                 }
    }
    
    //A method for another button which plays differnt sound
    @IBAction func Sound04(_ sender: Any) {
         do {
               let soundfour = Bundle.main.path(forResource: "sound4", ofType: ".wav")
               try sound_04 = AVAudioPlayer(contentsOf: URL(fileURLWithPath : soundfour!))
                      sound_04.play()
                 } catch {
                     print(error)
                 }
    }
    
    //A method for another button which plays differnt sound
    @IBAction func Sound05(_ sender: Any) {
        do {
               let soundfive = Bundle.main.path(forResource: "sound5", ofType: ".WAV")
               try sound_05 = AVAudioPlayer(contentsOf: URL(fileURLWithPath : soundfive!))
                      sound_05.play()
                 } catch {
                     print(error)
                 }
    }
    
    //A method for another button which plays differnt sound
    @IBAction func Sound06(_ sender: Any) {
         do {
               let soundsix = Bundle.main.path(forResource: "sound6", ofType: ".wav")
               try sound_06 = AVAudioPlayer(contentsOf: URL(fileURLWithPath : soundsix!))
                      sound_06.play()
                 } catch {
                     print(error)
                 }
    }
    
    //A method for another button which plays differnt sound
    @IBAction func Sound07(_ sender: Any) {
         do {
               let soundseven = Bundle.main.path(forResource: "sound7", ofType: ".mp3")
               try sound_07 = AVAudioPlayer(contentsOf: URL(fileURLWithPath : soundseven!))
                      sound_07.play()
                 } catch {
                     print(error)
                 }
    }
    
    //A method for another button which plays differnt sound
    @IBAction func Sound08(_ sender: Any) {
         do {
               let soundeight = Bundle.main.path(forResource: "sound8", ofType: ".mp3")
               try sound_08 = AVAudioPlayer(contentsOf: URL(fileURLWithPath : soundeight!))
                      sound_08.play()
                 } catch {
                     print(error)
                 }
    }
    
    //A method for another button which plays differnt sound
    @IBAction func Sound09(_ sender: Any) {
         do {
               let soundnine = Bundle.main.path(forResource: "sound9", ofType: ".mp3")
               try sound_09 = AVAudioPlayer(contentsOf: URL(fileURLWithPath : soundnine!))
                      sound_09.play()
                 } catch {
                     print(error)
                 }
    }
    
    
}

