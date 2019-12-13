import Foundation

@objc (RNPassbaseModule)
class PassbaseModule: NSObject {

  @objc func show(_ message: String) {
    let alert = UIAlertController(title: "RNPassbaseModule",
                                  message: message,
                                  preferredStyle: UIAlertController.Style.actionSheet)
    alert.addAction(UIAlertAction(title: "Cancel", style: .cancel))
    RCTPresentedViewController()?.present(alert, animated: true)
  }
}
