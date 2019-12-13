import Foundation

@objc (RNPassbaseComponentManager)
class PassbaseComponentManager: RCTViewManager {

  override func view() -> UIView! {
    return PassbaseComponent()
  }
}
